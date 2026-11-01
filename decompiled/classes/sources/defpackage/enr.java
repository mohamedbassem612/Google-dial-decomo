package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class enr {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public enr(char[] cArr) {
        defpackage.aozj aozjVar = new defpackage.aozj(new defpackage.aoiu(Integer.MIN_VALUE, null));
        this.a = aozjVar;
        this.b = new defpackage.fzh(aozjVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(java.lang.String str) {
        java.lang.Object objC;
        java.lang.Object obj = this.b;
        try {
            defpackage.aozj aozjVar = (defpackage.aozj) ((defpackage.gat) obj).b.get(str);
            return (aozjVar == null || (objC = aozjVar.c()) == null) ? ((defpackage.gat) obj).d.get(str) : objC;
        } catch (java.lang.ClassCastException unused) {
            ((defpackage.gat) obj).l(str);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Set b() {
        defpackage.gat gatVar = (defpackage.gat) this.b;
        return defpackage.ajsz.aI(defpackage.ajsz.aI(gatVar.d.keySet(), gatVar.c.keySet()), this.a.keySet());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final void c(java.lang.String str) {
        defpackage.aooh.f(str, "key");
        defpackage.aooh.f(str, "key");
        ((defpackage.gat) this.b).c.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void d(java.lang.String str, java.lang.Object obj) {
        java.util.List list = eon.a;
        if (obj != null) {
            java.util.List list2 = eon.a;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((java.lang.Class) it.next()).isInstance(obj));
            }
            throw new java.lang.IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        java.lang.Object obj2 = this.a.get(str);
        defpackage.eng engVar = obj2 instanceof defpackage.eng ? (defpackage.eng) obj2 : null;
        if (engVar != null) {
            engVar.k(obj);
        }
        ((defpackage.gat) this.b).k(str, obj);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void e(java.lang.String str, defpackage.gig gigVar) {
        ((defpackage.gat) this.b).c.put(str, gigVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void f(java.lang.String str) {
        defpackage.aooh.f(str, "key");
        ((defpackage.gat) this.b).l(str);
        if (((enq) this.a.remove(str)) != null) {
            throw null;
        }
    }

    public final void g(java.lang.Object obj) {
        defpackage.aozj aozjVar = (defpackage.aozj) this.a;
        aozjVar.e(new defpackage.aoiu(java.lang.Integer.valueOf(((java.lang.Number) ((defpackage.aoiu) aozjVar.c()).a).intValue() + 1), obj));
    }

    public final android.view.autofill.AutofillId h(long j) {
        return fn$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(this.a), aa$.ExternalSyntheticApiModelOutline0.m(((defpackage.kaw) j$.util.Objects.requireNonNull(new defpackage.kaw(aa$.ExternalSyntheticApiModelOutline0.m((android.view.View) this.b)))).a), j);
    }

    public final void i() {
        while (true) {
            java.lang.ref.Reference referencePoll = ((java.lang.ref.ReferenceQueue) this.a).poll();
            if (referencePoll == null) {
                return;
            } else {
                ((defpackage.cfc) this.b).m(referencePoll);
            }
        }
    }

    public enr(byte[] bArr) {
        this.a = new defpackage.dfb();
        this.b = new defpackage.add(16);
    }

    public enr(short[] sArr) {
        this.b = new defpackage.cfc(new java.lang.ref.Reference[16]);
        this.a = new java.lang.ref.ReferenceQueue();
    }

    public enr() {
        this.a = new java.util.LinkedHashMap();
        this.b = new defpackage.gat(defpackage.aokd.a);
    }

    public enr(java.util.Map map) {
        if (map == null) {
            defpackage.aooh.i("initialState");
        }
        this.a = new java.util.LinkedHashMap();
        this.b = new defpackage.gat(map);
    }

    public enr(defpackage.aopu aopuVar, defpackage.aonj aonjVar) {
        if (aonjVar == null) {
            defpackage.aooh.i("initializer");
        }
        this.a = aopuVar;
        this.b = aonjVar;
    }

    public enr(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }
}
