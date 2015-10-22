var gulp = require('gulp');
var babel = require('gulp-babel');

gulp.task('js_3pp', function () {
    return gulp.src(['node_modules/react/dist/react.min.js','node_modules/jquery/dist/jquery.min.js'])
        .pipe(gulp.dest('build/resources/main/static/'));
});

gulp.task('js', function () {
    return gulp.src('src/main/js/**/*.jsx')
        .pipe(babel())
        .pipe(gulp.dest('build/resources/main/static/'));
});

gulp.task('all', ['js', 'js_3pp']);

gulp.task('default', ['all']);
