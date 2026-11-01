package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oge implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public oge(ackk ackkVar, android.view.View view, int i) {
        this.$cid = i;
        this.a = view;
        j$.util.Objects.requireNonNull(ackkVar);
        this.b = ackkVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.$cid;
        if (i == 0) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.a;
            viewGroup.setPivotY(viewGroup.getHeight());
            defpackage.ogg oggVar = (defpackage.ogg) this.b;
            viewGroup.setPivotX(aooc.q((viewGroup.getWidth() - oggVar.e.getResources().getDimension(2131165771)) / 2.0f, 0.0f));
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            android.animation.Animator animator = oggVar.g;
            if (animator != null) {
                animator.start();
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap = null;
        if (i != 1) {
            if (i != 2) {
                android.view.View view = (android.view.View) this.a;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                android.view.View rootView = view.getRootView();
                acki ackiVar = new acki(this);
                int i2 = dzs.a;
                rootView.postOnAnimation(ackiVar);
                return;
            }
            aimz aimzVar = qal.a;
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentFirstDrawController$reportNextDraw$<anonymous>", "onGlobalLayout", 59, "ScreenHostFragmentFirstDrawController.kt");
            qal qalVar = (qal) this.a;
            qah qahVar = qalVar.b;
            aimwVarL.y("Fragment state: %s", ((ahfw) qahVar).a.d);
            aimzVar.b().l("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentFirstDrawController$reportNextDraw$<anonymous>", "onGlobalLayout", 60, "ScreenHostFragmentFirstDrawController.kt").y("View state: %s", qahVar.Q().P().d);
            qahVar.N().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            aimz aimzVar2 = zih.a;
            aoov.al(qalVar.c, zih.b.plus(aols.a), 1, new defpackage.lnb((aoln) null, qalVar, (j$.util.Optional) this.b, 8));
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.a;
        imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        try {
            amvb amvbVarA = new amup().a(android.net.Uri.encode((java.lang.String) this.b), amun.e, width);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(amvbVarA.a, height, android.graphics.Bitmap.Config.RGB_565);
            for (int i3 = 0; i3 < amvbVarA.a; i3++) {
                int[] iArr = new int[height];
                java.util.Arrays.fill(iArr, true != amvbVarA.d(i3, 0) ? -1 : -16777216);
                bitmapCreateBitmap.setPixels(iArr, 0, 1, i3, 0, 1, height);
            }
            bitmap = bitmapCreateBitmap;
        } catch (amus e) {
            a.bq(defpackage.mik.a.c(), "error generating barcode", "com/android/dialer/dialpadview/DeviceIdDialogHandler", "generateBarcode", (char) 512, "DeviceIdDialogHandler.java", e, zct.b);
        }
        if (bitmap != null) {
            ((android.widget.ImageView) this.a).setImageBitmap(bitmap);
        }
    }

    public oge(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
