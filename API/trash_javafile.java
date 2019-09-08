if (pos < mangbaihat.size()) {
    imgplay.setImageResource(R.drawable.iconpause);
    ++pos;
    if (repeat == true) {
        if (pos == 0) {
            pos = mangbaihat.size();
        }
        pos -= 1;
    }
    if (checkrandom == true) {
        Random random = new Random();
        int index = random.nextInt(mangbaihat.size());
        if (index == pos) {
            index--;
        }
        pos = index;
    }
    if (pos > mangbaihat.size() - 1) {
        pos = 0;
    }
    new PlayMp3().execute(mangbaihat.get(pos).getLinkbaihat());
    fragmentDiaNhac.PlayNhac(mangbaihat.get(pos).getHinhbaihat());
    getSupportActionBar().setTitle(mangbaihat.get(pos).getTenbaihat());
    UpdateTime();
}
}
imgpre.setClickable(false);
imgnext.setClickable(false);
Handler handler1 = new Handler();
handler1.postDelayed(new Runnable() {
    @Override
    public void run() {
        imgpre.setClickable(true);
        imgnext.setClickable(true);
    }
}, 1000);