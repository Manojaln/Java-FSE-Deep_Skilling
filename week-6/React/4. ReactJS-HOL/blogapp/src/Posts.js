import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }
    //  Load Posts using Fetch API
    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const postList = data.slice(0, 10).map(
                    item => new Post(item.id, item.title, item.body)
                );
                this.setState({ posts: postList });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
                this.setState({ hasError: true });
            });
    }
    //  Lifecycle Method
    componentDidMount() {
        this.loadPosts();
    }
    //  Lifecycle Error Catching
    componentDidCatch(error, info) {
        alert("An error occurred while rendering the component.");
        console.error("Error:", error);
    }
    // Rendering the Post List
    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong!</h2>;
        }
        return (
            <div style={{ padding: '20px' }}>
                <h1>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ marginBottom: '20px' }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
