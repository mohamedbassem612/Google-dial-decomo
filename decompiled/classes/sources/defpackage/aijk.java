package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aijk extends defpackage.aiby {
    private static final long serialVersionUID = 0;
    transient defpackage.ahzi c;

    public aijk(java.util.Map map, defpackage.ahzi ahziVar) {
        super(map);
        this.c = ahziVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.c = (defpackage.ahzi) j$.util.Objects.requireNonNull(objectInputStream.readObject());
        r((java.util.Map) j$.util.Objects.requireNonNull(objectInputStream.readObject()));
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.a);
    }

    @Override // defpackage.aiby, defpackage.aicr
    public final /* bridge */ /* synthetic */ java.util.Collection a() {
        return (java.util.List) this.c.eZ();
    }

    @Override // defpackage.aicr, defpackage.aije
    public final java.util.Map o() {
        java.util.Map map = this.a;
        if (map instanceof java.util.NavigableMap) {
            return new aich(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new aick(this, (java.util.SortedMap) map) : new aicd(this, map);
    }

    @Override // defpackage.aicr, defpackage.aije
    public final java.util.Set p() {
        java.util.Map map = this.a;
        if (map instanceof java.util.NavigableMap) {
            return new aici(this, (java.util.NavigableMap) map);
        }
        return map instanceof java.util.SortedMap ? new aicl(this, (java.util.SortedMap) map) : new defpackage.aicg(this, map);
    }
}
