package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afme extends kh {
    private java.util.List a;

    public final int a() {
        java.util.List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        return new aham(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624654, viewGroup, false), (char[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void m(ld ldVar, int i) {
        dxy dxyVar = (dxy) this.a.get(i);
        android.view.View view = ((aham) ldVar).s;
        ((android.widget.TextView) view.findViewById(2131429203)).setText((java.lang.CharSequence) dxyVar.a);
        ((android.widget.TextView) view.findViewById(2131429204)).setText((java.lang.CharSequence) dxyVar.b);
    }

    public final void w(java.util.List list) {
        this.a = list;
        e();
    }
}
