package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aiga extends defpackage.aigt implements aiii {
    private static final long serialVersionUID = 0;
    private transient defpackage.aiga a;
    public transient defpackage.aiga b;

    public aiga(aigf aigfVar, int i) {
        super(aigfVar, i);
    }

    public static defpackage.aiga b(aije aijeVar) {
        if (aijeVar.w()) {
            return defpackage.aien.a;
        }
        ailc<java.util.Map.Entry> aicbVar = new defpackage.aicb((defpackage.aicd) aijeVar.o());
        if (aicbVar.isEmpty()) {
            return defpackage.aien.a;
        }
        aigb aigbVar = new aigb(aicbVar.size());
        int size = 0;
        for (java.util.Map.Entry entry : aicbVar) {
            java.lang.Object key = entry.getKey();
            aify aifyVarN = aify.n((java.util.Collection) entry.getValue());
            if (!aifyVarN.isEmpty()) {
                aigbVar.i(key, aifyVarN);
                size += aifyVarN.size();
            }
        }
        return new defpackage.aiga(aigbVar.e(true), size);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(a.bj(i, "Invalid key count "));
        }
        aigb aigbVar = new aigb(4);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object objRequireNonNull = j$.util.Objects.requireNonNull(objectInputStream.readObject());
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new java.io.InvalidObjectException(a.bj(i4, "Invalid value count "));
            }
            aift aiftVar = new aift(4);
            for (int i5 = 0; i5 < i4; i5++) {
                aiftVar.i(j$.util.Objects.requireNonNull(objectInputStream.readObject()));
            }
            aigbVar.i(objRequireNonNull, aiftVar.h());
            i2 += i4;
        }
        try {
            this.a = new defpackage.aiga(aigbVar.e(true), i2);
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private java.lang.Object readResolve() {
        return j$.util.Objects.requireNonNull(this.a);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        defpackage.airh.g(this, objectOutputStream);
    }

    @Override // defpackage.aigt
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aify f(java.lang.Object obj) {
        aify aifyVar = (aify) this.map.get(obj);
        return aifyVar == null ? aike.a : aifyVar;
    }

    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.util.List g(java.lang.Object obj) {
        throw null;
    }
}
