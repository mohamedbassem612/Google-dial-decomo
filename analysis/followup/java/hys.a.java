    public final File a(hxw hxwVar) {
        String str;
        aooh.f(hxwVar, "<this>");
        Context context = this.c;
        File file = new File(context.getFilesDir(), "audioinjector");
        int iF = hgu.f(hxwVar);
        if (iF == 0) {
            str = context.getResources().getResourceEntryName(((hxz) hxwVar).a) + '_' + c() + ".wav";
        } else {
            if (iF == 1) {
                throw null;
            }
            str = "";
        }
        return new File(file, str);
    }
