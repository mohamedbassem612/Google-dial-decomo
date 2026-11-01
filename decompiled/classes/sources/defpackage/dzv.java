package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dzv implements defpackage.aoql {
    final /* synthetic */ android.view.ViewGroup a;

    public dzv(android.view.ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.aoql
    public final java.util.Iterator a() {
        android.view.ViewGroup viewGroup = this.a;
        if (viewGroup == null) {
            defpackage.aooh.i("<this>");
        }
        return new defpackage.dzw(viewGroup);
    }
}
