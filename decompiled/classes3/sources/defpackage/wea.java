package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wea extends ejy {
    final /* synthetic */ defpackage.web a;

    public wea(defpackage.web webVar) {
        j$.util.Objects.requireNonNull(webVar);
        this.a = webVar;
    }

    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        int i = ((android.view.WindowManager.LayoutParams) obj).y;
        defpackage.web webVar = this.a;
        return defpackage.web.a(i + webVar.h, webVar.e, webVar.g);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj;
        defpackage.web webVar = this.a;
        layoutParams.y = ((int) f) - webVar.h;
        wdx wdxVar = webVar.c;
        if (wdxVar.n()) {
            webVar.b.updateViewLayout(wdxVar.a(), layoutParams);
        }
    }
}
