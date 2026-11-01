package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aela implements defpackage.xvb {
    private final int a;
    private final defpackage.aelb b;
    private final xtq c;

    public aela(xtq xtqVar, defpackage.aelb aelbVar, int i) {
        this.c = xtqVar;
        this.b = aelbVar;
        this.a = i;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return android.graphics.Bitmap.class;
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        int i = this.a;
        ahvr.bN((boolean) ((i ^ (-1)) >>> 31), "Size must be bigger or equal to 0");
        defpackage.aekx aekxVar = this.b.b;
        ahvr.bN(xtq.Q(aekxVar), "handles(key) must be true");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = aekxVar.b;
        if (str != null) {
            arrayList.add(str);
        }
        xtq xtqVar = this.c;
        if (i == 0) {
            i = 120;
        }
        java.lang.String str2 = aekxVar.a;
        arrayList.add(str2);
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        arrayList.toArray(strArr);
        defpackage.afml afmlVar = new defpackage.afml(new defpackage.afmn(((android.content.Context) xtqVar.a).getApplicationContext(), new ajbn()));
        int[] iArr = defpackage.afmk.a;
        defpackage.afml afmlVar2 = new defpackage.afml(afmlVar);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        android.graphics.Rect rect = new android.graphics.Rect();
        afmlVar2.b(null);
        defpackage.afml.a(null);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        int iA = defpackage.afml.a(str2);
        java.lang.CharSequence charSequenceB = afmlVar2.b(new defpackage.aprf(strArr));
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        int height = bitmapCreateBitmap.getHeight();
        int width = bitmapCreateBitmap.getWidth();
        paint.setColor(iA);
        int height2 = canvas.getHeight();
        int width2 = canvas.getWidth();
        canvas.drawCircle(width2 / 2, height2 / 2, java.lang.Math.min(width2, height2) / 2, paint);
        if (charSequenceB != null) {
            paint.setColor(-1);
            paint.setTextSize(java.lang.Math.min(height, width) * 0.47f);
            paint.getTextBounds(charSequenceB.toString(), 0, charSequenceB.length(), rect);
            canvas.drawText(charSequenceB, 0, charSequenceB.length(), width / 2, (height / 2) - rect.exactCenterY(), paint);
        }
        xvaVar.c(bitmapCreateBitmap);
    }

    @Override // defpackage.xvb
    public final void d() {
    }

    @Override // defpackage.xvb
    public final void e() {
    }
}
