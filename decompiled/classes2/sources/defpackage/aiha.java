package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiha extends defpackage.aidb implements java.io.Serializable {
    public static final defpackage.aiha a = new defpackage.aiha(aike.a);
    public static final defpackage.aiha b = new defpackage.aiha(aify.p(defpackage.aikb.a));
    private final transient aify c;

    public aiha(aify aifyVar) {
        this.c = aifyVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.aikc
    public final /* bridge */ /* synthetic */ java.util.Set a() {
        aify aifyVar = this.c;
        if (aifyVar.isEmpty()) {
            return aikn.a;
        }
        defpackage.aikb aikbVar = defpackage.aikb.a;
        return new aiko(aifyVar, defpackage.aika.a);
    }

    java.lang.Object writeReplace() {
        return new defpackage.aigz(this.c);
    }
}
