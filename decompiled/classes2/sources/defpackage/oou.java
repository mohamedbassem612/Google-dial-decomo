package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oou implements aonj {
    private final /* synthetic */ int $cid;

    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.85f);
        java.lang.Float fValueOf3 = java.lang.Float.valueOf(0.0f);
        switch (i) {
            case 0:
                android.content.ContentResolver contentResolver = (android.content.ContentResolver) obj;
                java.lang.String str = defpackage.oov.a;
                aooh.f(contentResolver, "contentResolver");
                return java.lang.Boolean.valueOf(defpackage.oov.a(contentResolver, defpackage.oov.c) == 1);
            case 1:
                android.content.ContentResolver contentResolver2 = (android.content.ContentResolver) obj;
                java.lang.String str2 = defpackage.oov.a;
                aooh.f(contentResolver2, "contentResolver");
                return java.lang.Boolean.valueOf(defpackage.oov.a(contentResolver2, defpackage.oov.b) == 1);
            case 2:
                android.content.ContentResolver contentResolver3 = (android.content.ContentResolver) obj;
                java.lang.String str3 = defpackage.oov.a;
                aooh.f(contentResolver3, "contentResolver");
                return java.lang.Boolean.valueOf(android.provider.Settings.System.getInt(contentResolver3, defpackage.oov.d, 0) == 1);
            case 3:
                ((java.lang.Float) obj).floatValue();
                return aojh.a;
            case 4:
                return afsq.cp((diq) obj);
            case 5:
                csj csjVar = (csj) obj;
                aooh.f(csjVar, "$this$Canvas");
                den.P(csjVar, cfd.U((aoiu[]) java.util.Arrays.copyOf(new aoiu[]{new aoiu(fValueOf3, new cqg(-72057594037927936L)), new aoiu(fValueOf2, new cqg(-45020542981373952L)), new aoiu(fValueOf, new cqg(-45020542981373952L))}, 3)), 0L, 0L, 0.0f, (den) null, 0, 126);
                return aojh.a;
            case 6:
                csj csjVar2 = (csj) obj;
                aooh.f(csjVar2, "$this$Canvas");
                den.P(csjVar2, cfd.U((aoiu[]) java.util.Arrays.copyOf(new aoiu[]{new aoiu(fValueOf3, new cqg(-72057594037927936L)), new aoiu(fValueOf2, new cqg(-45020542981373952L)), new aoiu(fValueOf, new cqg(-45020542981373952L))}, 3)), 0L, 0L, 0.0f, (den) null, 0, 126);
                android.graphics.Canvas canvasA = cpr.a(csjVar2.q().b());
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setColor(cfd.L(-44173910438051840L));
                paint.setMaskFilter(new android.graphics.BlurMaskFilter(java.lang.Float.intBitsToFloat((int) (csjVar2.o() >> 32)) / 4.0f, android.graphics.BlurMaskFilter.Blur.NORMAL));
                canvasA.drawCircle(java.lang.Float.intBitsToFloat((int) (csjVar2.o() >> 32)) / 2.0f, java.lang.Float.intBitsToFloat((int) (csjVar2.o() & 4294967295L)) / 8.0f, java.lang.Float.intBitsToFloat((int) (csjVar2.o() >> 32)) / 1.8f, paint);
                return aojh.a;
            case 7:
                android.widget.ViewAnimator viewAnimator = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator, "it");
                viewAnimator.setVisibility(8);
                return aojh.a;
            case 8:
                android.widget.ViewAnimator viewAnimator2 = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator2, "it");
                viewAnimator2.setVisibility(8);
                return aojh.a;
            case 9:
                android.widget.ViewAnimator viewAnimator3 = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator3, "it");
                viewAnimator3.setVisibility(0);
                return aojh.a;
            case 10:
                com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) obj;
                aooh.f(chip, "it");
                chip.setVisibility(8);
                return aojh.a;
            case 11:
                android.widget.Chronometer chronometer = (android.widget.Chronometer) obj;
                aooh.f(chronometer, "it");
                chronometer.setTextColor(urg.c(chronometer.getContext(), android.R.attr.textColorPrimary));
                return aojh.a;
            case 12:
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                aooh.f(imageView, "it");
                imageView.setImageTintList(null);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.widget.ImageView imageView2 = (android.widget.ImageView) obj;
                aooh.f(imageView2, "it");
                imageView2.setVisibility(0);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.widget.ImageView imageView3 = (android.widget.ImageView) obj;
                aooh.f(imageView3, "it");
                imageView3.setVisibility(8);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.widget.TextView textView = (android.widget.TextView) obj;
                aooh.f(textView, "it");
                textView.setVisibility(8);
                return aojh.a;
            case 16:
                android.widget.ViewAnimator viewAnimator4 = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator4, "it");
                viewAnimator4.setVisibility(0);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                com.google.android.material.chip.Chip chip2 = (com.google.android.material.chip.Chip) obj;
                aooh.f(chip2, "it");
                chip2.setVisibility(8);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                android.widget.ViewAnimator viewAnimator5 = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator5, "it");
                viewAnimator5.setDisplayedChild(1);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                android.widget.TextView textView2 = (android.widget.TextView) obj;
                aooh.f(textView2, "it");
                textView2.setTextColor(textView2.getContext().getColor(2131099860));
                return aojh.a;
            default:
                android.widget.ViewAnimator viewAnimator6 = (android.widget.ViewAnimator) obj;
                aooh.f(viewAnimator6, "it");
                viewAnimator6.setDisplayedChild(0);
                return aojh.a;
        }
    }
}
