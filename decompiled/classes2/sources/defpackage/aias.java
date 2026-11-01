package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aias implements java.util.Iterator {
    int a;
    int b;
    aiaz c;
    java.util.concurrent.atomic.AtomicReferenceArray d;
    aibu e;
    defpackage.aibs f;
    defpackage.aibs g;
    final /* synthetic */ aibt h;

    public aias(aibt aibtVar) {
        j$.util.Objects.requireNonNull(aibtVar);
        this.h = aibtVar;
        this.a = aibtVar.f.length - 1;
        this.b = -1;
        b();
    }

    final defpackage.aibs a() {
        defpackage.aibs aibsVar = this.f;
        if (aibsVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.g = aibsVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            aibt aibtVar = this.h;
            this.a = i - 1;
            aiaz aiazVar = aibtVar.f[i];
            this.c = aiazVar;
            if (aiazVar.b != 0) {
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.c.f;
                this.d = atomicReferenceArray;
                this.b = atomicReferenceArray.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(aibu aibuVar) {
        boolean z;
        java.lang.Object obj;
        try {
            aibt aibtVar = this.h;
            long jA = aibtVar.q.a();
            java.lang.Object objJ = aibuVar.j();
            java.lang.Object obj2 = null;
            if (aibuVar.j() != null && (obj = aibuVar.d().get()) != null && !aibtVar.k(aibuVar, jA)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f = new defpackage.aibs(aibtVar, objJ, obj2);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.o();
        }
    }

    final boolean d() {
        aibu aibuVar = this.e;
        if (aibuVar != null) {
            while (true) {
                this.e = aibuVar.e();
                aibu aibuVar2 = this.e;
                if (aibuVar2 == null) {
                    break;
                }
                if (c(aibuVar2)) {
                    return true;
                }
                aibuVar = this.e;
            }
        }
        return false;
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            aibu aibuVar = (aibu) atomicReferenceArray.get(i);
            this.e = aibuVar;
            if (aibuVar != null && (c(aibuVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahvr.bY(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
