package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class albt implements java.util.Iterator {
    private final java.util.ArrayDeque a;
    private akyz b;

    public albt(akzc akzcVar) {
        if (!(akzcVar instanceof defpackage.albv)) {
            this.a = null;
            this.b = (akyz) akzcVar;
            return;
        }
        defpackage.albv albvVar = (defpackage.albv) akzcVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(albvVar.g);
        this.a = arrayDeque;
        arrayDeque.push(albvVar);
        this.b = b(albvVar.c);
    }

    private final akyz b(akzc akzcVar) {
        while (akzcVar instanceof defpackage.albv) {
            defpackage.albv albvVar = (defpackage.albv) akzcVar;
            this.a.push(albvVar);
            int[] iArr = defpackage.albv.a;
            akzcVar = albvVar.c;
        }
        return (akyz) akzcVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final akyz next() {
        akyz akyzVarB;
        akyz akyzVar = this.b;
        if (akyzVar == null) {
            throw new java.util.NoSuchElementException();
        }
        do {
            java.util.ArrayDeque arrayDeque = this.a;
            akyzVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            defpackage.albv albvVar = (defpackage.albv) arrayDeque.pop();
            int[] iArr = defpackage.albv.a;
            akyzVarB = b(albvVar.f);
        } while (akyzVarB.C());
        this.b = akyzVarB;
        return akyzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
