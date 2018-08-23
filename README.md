# TrackerPathing
This repo contains a prototype web app which displays a map using the Marker and Polyline feature to visualize GPS tracker coordinates. Code is heavily adapted from Google Maps API guides. It also includes a quick Java program to convert large amounts of GPS coordinates to the appropriate formatting for pasting into the web app.

To use: simply insert your personal API key from Google Maps within the code and replace the existing GPS coordinate information with your own. To make this easier, I've included a Java program will reformat coordinate information from the below format (typical output from asset trackers), to one which is understood by the web app. 

See below for more information.

Formatting of original GPS coordinate text file :

40.443737, -79.958351

40.443741, -79.958214

40.443733, -79.957771

40.443581, -79.957664

.....

is then modified to 

{lat: 40.443737, lng: -79.958351},

{lat: 40.443741, lng: -79.958214},

{lat: 40.443733, lng: -79.957771},

{lat: 40.443581, lng: -79.957664}

.....

using the executable .jar or Java program in this Repo. 
