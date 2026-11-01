package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjz {
    public int a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public bjz() {
        this.b = new java.util.ArrayList();
        this.a = -1000;
    }

    public static defpackage.bjz b(defpackage.tt ttVar, java.lang.CharSequence charSequence, int i) {
        defpackage.bjz bjzVar = new defpackage.bjz((defpackage.tt) j$.util.Objects.requireNonNull(ttVar));
        bjzVar.c = (java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence);
        bjzVar.a = i;
        return bjzVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final void a() {
        final ?? r0 = this.c;
        if (r0 == 0) {
            throw new java.lang.IllegalStateException("setText must have been called");
        }
        defpackage.tc tcVar = (defpackage.tc) ((defpackage.tt) this.b).a(defpackage.tc.class);
        final int i = this.a;
        j$.util.Objects.requireNonNull((java.lang.Object) r0);
        tcVar.c.b("showToast", new defpackage.tu() { // from class: sz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.tu
            public final void a(java.lang.Object obj) {
                obj.showToast(r0, i);
            }
        });
    }

    public bjz(defpackage.tt ttVar) {
        this.b = (defpackage.tt) j$.util.Objects.requireNonNull(ttVar);
    }

    public bjz(dgk dgkVar) {
        this.b = dgkVar;
    }
}
