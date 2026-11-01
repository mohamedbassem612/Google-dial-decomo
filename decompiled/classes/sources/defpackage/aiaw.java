package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiaw implements java.io.Serializable, defpackage.ahzv {
    private static final long serialVersionUID = 1;
    public final defpackage.aibt a;

    public aiaw(defpackage.aiaa aiaaVar) {
        this.a = new defpackage.aibt(aiaaVar);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use ManualSerializationProxy");
    }

    java.lang.Object writeReplace() {
        defpackage.aibt aibtVar = this.a;
        return new aiax(aibtVar.j, aibtVar.k, aibtVar.h, aibtVar.i, aibtVar.n, aibtVar.m, aibtVar.l, aibtVar.v, aibtVar.g, aibtVar.p, aibtVar.q);
    }
}
