package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aidf extends defpackage.aiby {
    private static final long serialVersionUID = 0;
    transient int c;

    public aidf(byte[] bArr) {
        super(new defpackage.aieb(12));
        this.c = 3;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int i = objectInputStream.readInt();
        r(new defpackage.aieb());
        airh.f(this, objectInputStream, i);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        airh.g(this, objectOutputStream);
    }

    @Override // defpackage.aiby, defpackage.aicr
    public final /* bridge */ /* synthetic */ java.util.Collection a() {
        return new java.util.ArrayList(this.c);
    }

    private aidf() {
        throw null;
    }
}
