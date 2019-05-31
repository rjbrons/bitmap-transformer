# bitmap-transformer

**Use**  
from the command line enter :   
./gradlew run --args 'original_image_filepath destination_image_filepath transform_name'  

ex. 
./gradlew run --args './assets/logo.bmp ./assets/greyscale_logo.bmp grey'  

./gradlew run --args './assets/logo.bmp ./assets/black_logo.bmp black'  

./gradlew run --args './assets/logo.bmp ./assets/negative_logo.bmp negative'  


## Supported Transforms: 

# blackout (black)
Takes in a bitmap image file and converts all the pixels to black.

# negative (negative)
Takes in a bitmap image file and converts it to a negative of the original image and saves new image to file.

# greyscale (grey)
Takes in a bitmap image file and converts it to a greyscale of the original image and saves new image to file.
