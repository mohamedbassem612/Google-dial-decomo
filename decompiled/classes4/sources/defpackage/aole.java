package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aole implements java.io.Externalizable {
    private static final long serialVersionUID = 0;
    private java.util.Collection a;
    private final int b;

    public aole(java.util.Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final java.lang.Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.InvalidObjectException {
        java.util.Collection collectionAX;
        aooh.f(objectInput, "input");
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new java.io.InvalidObjectException(a.bw((byte) 46, b, "Unsupported flags value: "));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new java.io.InvalidObjectException(a.bw((byte) 46, i2, "Illegal size value: "));
        }
        int i3 = 0;
        if (i != 0) {
            aolg aolgVar = new aolg(i2);
            while (i3 < i2) {
                aolgVar.add(objectInput.readObject());
                i3++;
            }
            collectionAX = ajsz.aE(aolgVar);
        } else {
            aokv aokvVar = new aokv(i2);
            while (i3 < i2) {
                aokvVar.add(objectInput.readObject());
                i3++;
            }
            collectionAX = ajsz.aX(aokvVar);
        }
        this.a = collectionAX;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        aooh.f(objectOutput, "output");
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public aole() {
        this(aokc.a, 0);
    }
}
