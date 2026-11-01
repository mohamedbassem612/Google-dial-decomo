package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigx implements java.io.Serializable {
    private static final long serialVersionUID = -6456416336206982697L;
    final aigy a;

    public aigx(aigy aigyVar) {
        this.a = aigyVar;
    }

    java.lang.Object readResolve() {
        return this.a.o();
    }
}
