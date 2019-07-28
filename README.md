# tavornwattana

<b>Create a new repository</b> <br />

cd to your project directory e.g. cd projects/newproject <br />
Run the following git commands <br />
git init <br />
git add . <br />
 git commit -m “Initial commit” <br />
git remote add origin https://github.com/username/projectname.git <br />
Notes: <br />
I think: git remote add origin git@github.com:username/projectname.git does the same thing.
The ‘origin’ name is arbitrary (As with branch naming, remote alias names are arbitrary – just as ‘master’ has no special meaning but is widely used because git init sets it up by default, ‘origin’ is often used as a remote name because git clone sets it up by default as the cloned-from URL. You can really name it just about anything.)
git push -u origin master <br />
(Note to remove a remote again: git remote rm origin) <br />
