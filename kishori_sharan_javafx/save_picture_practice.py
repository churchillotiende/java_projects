//An arg of picture from form
def save_picture(form_picture):
random_hex = secrets.token_hex(8)
_ , f_ext = os.path.splitext(form_picture.filename)
picture_fn = random_hex + f_ext
picture_path = os.path.join(app.root_path , "static/profile_pics" , picture_fn)

// Resizing the image using Pillow
i = Image.open(form_picture)
outputsize = (125 , 125)
i.thumbnail(outputsize)
i.save(picture_path)
return picture_fn
