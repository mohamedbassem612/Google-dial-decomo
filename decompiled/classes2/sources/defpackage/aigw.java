package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigw extends aihq {
    private static final long serialVersionUID = 0;
    final /* synthetic */ aigy a;

    public aigw(aigy aigyVar) {
        j$.util.Objects.requireNonNull(aigyVar);
        this.a = aigyVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        return this.a.p(i);
    }

    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aijp)) {
            return false;
        }
        defpackage.aijp aijpVar = (defpackage.aijp) obj;
        return aijpVar.a() > 0 && this.a.b(aijpVar.a) == aijpVar.a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean l() {
        return false;
    }

    public final int size() {
        return this.a.n().size();
    }

    public java.lang.Object writeReplace() {
        return new defpackage.aigx(this.a);
    }
}
