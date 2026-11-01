package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdw {
    public defpackage.web a;
    public final defpackage.wee b;
    public final android.widget.ImageView c;
    public final android.widget.ImageView d;
    public final /* synthetic */ wdx e;

    public wdw(wdx wdxVar, android.content.Context context) {
        j$.util.Objects.requireNonNull(wdxVar);
        this.e = wdxVar;
        defpackage.wee weeVar = new defpackage.wee(context);
        this.b = weeVar;
        android.view.View viewInflate = android.view.LayoutInflater.from(weeVar.getContext()).inflate(2131624042, (android.view.ViewGroup) weeVar, true);
        this.d = (android.widget.ImageView) viewInflate.findViewById(2131427615);
        this.c = (android.widget.ImageView) viewInflate.findViewById(2131427616);
        weeVar.a = new defpackage.wdv(this, wdxVar);
        this.a = new defpackage.web(weeVar, wdxVar);
    }

    public final void a(boolean z) {
        this.a.j = z;
    }
}
