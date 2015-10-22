var Main = React.createClass({
    getInitialState: function() {
      return {issues: []};
    },
    componentDidMount: function() {
      $.get('/issues', function(issues) {
        this.setState({issues: issues});
      }.bind(this));
    },
    render: function() {
        var issues = this.state.issues.map(issue => <li>{issue.title}</li>)
        return <div><ul>{issues}</ul></div>;
    }
});

React.render(<Main/>,document.getElementById("content"));
