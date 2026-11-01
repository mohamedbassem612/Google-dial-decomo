package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiax extends aiey implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    final aibb a;
    final aibb b;
    final ahxt c;
    final ahxt d;
    final long e;
    final long f;
    final long g;
    final int h;
    final aibv i;
    final ahzp j;
    transient ahzv k;
    final ahzz l;

    public aiax(aibb aibbVar, aibb aibbVar2, ahxt ahxtVar, ahxt ahxtVar2, long j, long j2, long j3, ahzz ahzzVar, int i, aibv aibvVar, ahzp ahzpVar) {
        this.a = aibbVar;
        this.b = aibbVar2;
        this.c = ahxtVar;
        this.d = ahxtVar2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.l = ahzzVar;
        this.h = i;
        this.i = aibvVar;
        this.j = (ahzpVar == ahzp.a || ahzpVar == aiaa.b) ? null : ahzpVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        aiaa aiaaVar = new aiaa();
        aiaaVar.h(this.a);
        aibb aibbVar = aiaaVar.h;
        ahvr.cc(aibbVar == null, "Value strength was already set to %s", aibbVar);
        aibb aibbVar2 = this.b;
        ahvr.ci(aibbVar2);
        aiaaVar.h = aibbVar2;
        ahxt ahxtVar = aiaaVar.k;
        ahvr.cc(ahxtVar == null, "key equivalence was already set to %s", ahxtVar);
        ahxt ahxtVar2 = this.c;
        ahvr.ci(ahxtVar2);
        aiaaVar.k = ahxtVar2;
        ahxt ahxtVar3 = aiaaVar.l;
        ahvr.cc(ahxtVar3 == null, "value equivalence was already set to %s", ahxtVar3);
        ahxt ahxtVar4 = this.d;
        ahvr.ci(ahxtVar4);
        aiaaVar.l = ahxtVar4;
        aiaaVar.d(java.lang.Math.min(this.h, 1024));
        aiaaVar.g(this.i);
        aiaaVar.c = false;
        long j = this.e;
        if (j > 0) {
            aiaaVar.e(j, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        long j2 = this.f;
        if (j2 > 0) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
            long j3 = aiaaVar.j;
            ahvr.cb(j3 == -1, "expireAfterAccess was already set to %s ns", j3);
            ahvr.cg(true, j2, timeUnit);
            aiaaVar.j = j2;
        }
        ahzz ahzzVar = this.l;
        if (ahzzVar != ahzz.a) {
            ahvr.bY(aiaaVar.p == null);
            if (aiaaVar.c) {
                long j4 = aiaaVar.e;
                ahvr.cb(j4 == -1, "weigher can not be combined with maximum size (%s provided)", j4);
            }
            ahvr.ci(ahzzVar);
            aiaaVar.p = ahzzVar;
            long j5 = this.g;
            if (j5 != -1) {
                long j6 = aiaaVar.f;
                ahvr.cb(j6 == -1, "maximum weight was already set to %s", j6);
                long j7 = aiaaVar.e;
                ahvr.cb(j7 == -1, "maximum size was already set to %s", j7);
                aiaaVar.f = j5;
            }
        } else {
            long j8 = this.g;
            if (j8 != -1) {
                aiaaVar.f(j8);
            }
        }
        ahzp ahzpVar = this.j;
        if (ahzpVar != null) {
            ahvr.bY(aiaaVar.n == null);
            aiaaVar.n = ahzpVar;
        }
        this.k = aiaaVar.a();
    }

    private java.lang.Object readResolve() {
        return this.k;
    }

    protected final /* synthetic */ java.lang.Object fp() {
        return this.k;
    }
}
