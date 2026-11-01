package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mgt {
    final /* synthetic */ mgu a;
    private final java.lang.Object b;

    public mgt(mgu mguVar, ajcq ajcqVar) {
        j$.util.Objects.requireNonNull(mguVar);
        this.a = mguVar;
        this.b = ajcqVar;
    }

    public final defpackage.mgs a(java.lang.Object obj) {
        java.lang.Object obj2 = this.b;
        return new defpackage.mgs(this.a, obj, obj2, (java.lang.String) obj2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ajcq, java.lang.Object] */
    public final defpackage.mgg b(java.lang.Object obj) {
        mgu mguVar = this.a;
        ?? r2 = this.b;
        return new defpackage.mgg(mguVar, obj, r2, r2);
    }

    public mgt(mgu mguVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(mguVar);
        this.a = mguVar;
        this.b = str;
    }
}
