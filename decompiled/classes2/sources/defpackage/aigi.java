package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigi implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final aigf a;

    public aigi(aigf aigfVar) {
        this.a = aigfVar;
    }

    java.lang.Object readResolve() {
        return this.a.f();
    }
}
