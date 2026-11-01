package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aihg extends defpackage.aigt implements aikr {
    private static final long serialVersionUID = 0;
    private transient defpackage.aihg a;
    private final transient aihd emptySet;

    public aihg(aigf aigfVar, int i, java.util.Comparator comparator) {
        super(aigfVar, i);
        this.emptySet = comparator == null ? aikn.a : aiho.G(comparator);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        java.util.Comparator comparator = (java.util.Comparator) objectInputStream.readObject();
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
            aihb aihbVar = comparator == null ? new aihb() : new aihm(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                aihbVar.i(j$.util.Objects.requireNonNull(objectInputStream.readObject()));
            }
            aihd aihdVarH = aihbVar.h();
            if (aihdVarH.size() != i4) {
                throw new java.io.InvalidObjectException("Duplicate key-value pairs exist for key ".concat(java.lang.String.valueOf(java.lang.String.valueOf(objRequireNonNull))));
            }
            aigbVar.i(objRequireNonNull, aihdVarH);
            i2 += i4;
        }
        try {
            this.a = new defpackage.aihg(aigbVar.e(true), i2, comparator);
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private java.lang.Object readResolve() {
        return j$.util.Objects.requireNonNull(this.a);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        aiho aihoVar = this.emptySet;
        objectOutputStream.writeObject(aihoVar instanceof aiho ? aihoVar.a : null);
        defpackage.airh.g(this, objectOutputStream);
    }

    @Override // defpackage.aigt
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ java.util.Collection f(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.aigt
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aifo i() {
        return new defpackage.aihf(this);
    }

    @Override // defpackage.aigt
    public final /* synthetic */ java.util.Collection i() {
        return new defpackage.aihf(this);
    }
}
