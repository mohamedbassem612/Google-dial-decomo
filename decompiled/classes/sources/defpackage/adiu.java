package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adiu implements defpackage.adhy {
    public final defpackage.aigf a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.aify c;
    private final byte[] d;
    private defpackage.aify e;

    public adiu(defpackage.aigf aigfVar, defpackage.aify aifyVar, byte[] bArr) {
        this.a = c(aigfVar);
        this.c = aifyVar;
        this.d = bArr;
    }

    public static defpackage.aigf c(java.util.Map map) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (java.util.Map.Entry entry : map.entrySet()) {
            aigbVar.i((java.lang.String) entry.getKey(), ((defpackage.adhy) entry.getValue()).a());
        }
        return aigbVar.e(true);
    }

    @Override // defpackage.adhy
    public final /* bridge */ /* synthetic */ defpackage.adhy a() {
        defpackage.adik.i(this.b.get());
        return new defpackage.adiu(this.a, this.c, this.d);
    }

    public final synchronized com.google.android.libraries.micore.superpacks.base.VersionedName b() {
        java.util.Collection collectionE = e();
        if (collectionE.isEmpty()) {
            return null;
        }
        return ((com.google.android.libraries.micore.superpacks.common.PackManifest) defpackage.ahvr.bh(collectionE, 0)).e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        java.util.Iterator it = f().iterator();
        while (it.hasNext()) {
            adir adirVar = (adir) this.a.get((java.lang.String) it.next());
            if (adirVar != null) {
                adirVar.close();
            }
        }
    }

    public final java.io.File d(java.lang.String str) {
        defpackage.adik.i(this.b.get());
        adir adirVar = (adir) this.a.get(str);
        if (adirVar != null) {
            return adirVar.b.b();
        }
        throw new java.lang.IllegalArgumentException("Pack is not in this set: ".concat(java.lang.String.valueOf(str)));
    }

    public final synchronized java.util.Collection e() {
        defpackage.aify aifyVarH;
        aifyVarH = this.e;
        if (aifyVarH == null) {
            defpackage.aigf aigfVar = this.a;
            if (aigfVar.isEmpty()) {
                aifyVarH = defpackage.aike.a;
                this.e = aifyVarH;
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                defpackage.ailk ailkVarY = ((defpackage.aify) aigfVar.values()).listIterator(0);
                while (ailkVarY.hasNext()) {
                    aiftVar.i(((adir) ailkVarY.next()).a);
                }
                aifyVarH = aiftVar.g();
                this.e = aifyVarH;
            }
        }
        return aifyVarH;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adiu) {
            defpackage.adiu adiuVar = (defpackage.adiu) obj;
            boolean zAJ = defpackage.ahvr.aJ(this.a, adiuVar.a);
            boolean zEquals = java.util.Arrays.equals(this.d, adiuVar.d);
            if (zAJ && zEquals) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Set f() {
        return j$.util.DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.b("superpack", b());
        ahymVar.g("metadata", this.d != null);
        ahymVar.b("packs", defpackage.ahyj.d(',').b(this.a.values()));
        return ahymVar.toString();
    }
}
