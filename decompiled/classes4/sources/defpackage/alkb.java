package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkb implements defpackage.alkw {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/EventLogger");
    private final java.util.List b;
    private final java.util.List c;
    private j$.util.Optional d;
    private java.lang.Boolean e;
    private final defpackage.alkc f;
    private final defpackage.aljy g;
    private final akzx h;

    public alkb(defpackage.aljy aljyVar, defpackage.alkc alkcVar) {
        this.b = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());
        this.c = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());
        this.h = defpackage.alna.a.m();
        this.e = java.lang.Boolean.FALSE;
        this.g = aljyVar;
        this.d = j$.util.Optional.empty();
        this.f = alkcVar;
    }

    private final void f() {
        byte[] bArrI = ((defpackage.alna) this.h.p()).i();
        int length = bArrI.length;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArrI, 0, length);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                akzx akzxVarM = defpackage.almt.a.m();
                akzc akzcVarU = akzc.u(byteArray);
                akzxVarM.u();
                defpackage.almt almtVar = (defpackage.almt) akzxVarM.b;
                j$.util.Objects.requireNonNull(akzcVarU);
                almtVar.b |= 1;
                almtVar.c = akzcVarU;
                defpackage.almt almtVar2 = (defpackage.almt) akzxVarM.p();
                this.c.add(almtVar2);
                try {
                    j$.util.Optional optional = this.d;
                    defpackage.alju aljuVar = new defpackage.alju(almtVar2, 7);
                    if (true == optional.isPresent()) {
                        ((defpackage.amgv) optional.get()).f((defpackage.almt) aljuVar.a);
                    }
                } catch (java.lang.RuntimeException e) {
                    this.g.a(e, "Error while calling the listener.", "log", defpackage.aljr.e);
                }
                akzx akzxVar = this.h;
                akzxVar.u();
                ((defpackage.alna) akzxVar.b).b = albq.a;
            } catch (java.lang.Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.alkw
    public final synchronized void a(defpackage.almy almyVar) {
        j$.util.Optional optionalA = this.f.a(almyVar);
        if (!optionalA.isEmpty()) {
            if (this.e.booleanValue()) {
                akzx akzxVar = this.h;
                j$.util.Objects.requireNonNull(akzxVar);
                defpackage.alju aljuVar = new defpackage.alju(akzxVar, 6);
                optionalA.isPresent();
                java.lang.Object obj = optionalA.get();
                java.lang.Object obj2 = aljuVar.a;
                ((akzx) obj2).u();
                defpackage.alna alnaVar = (defpackage.alna) ((akzx) obj2).b;
                defpackage.alna alnaVar2 = defpackage.alna.a;
                j$.util.Objects.requireNonNull(obj);
                alat alatVar = alnaVar.b;
                if (!alatVar.c()) {
                    alnaVar.b = alad.J(alatVar);
                }
                alnaVar.b.add(obj);
                if (((defpackage.alna) akzxVar.p()).e((albw) null) > 122880.0f) {
                    f();
                }
            } else {
                java.util.List list = this.b;
                j$.util.Objects.requireNonNull(list);
                defpackage.alju aljuVar2 = new defpackage.alju(list, 4);
                optionalA.isPresent();
                aljuVar2.a.add(optionalA.get());
                try {
                    j$.util.Optional optional = this.d;
                    defpackage.alju aljuVar3 = new defpackage.alju(optionalA, 5);
                    if (true == optional.isPresent()) {
                        java.lang.Object obj3 = optional.get();
                        java.lang.Object obj4 = aljuVar3.a;
                        j$.util.Objects.requireNonNull(obj3);
                        defpackage.alju aljuVar4 = new defpackage.alju(obj3, 8);
                        ((j$.util.Optional) obj4).isPresent();
                        ((defpackage.amgv) aljuVar4.a).d((defpackage.almy) ((j$.util.Optional) obj4).get());
                    }
                } catch (java.lang.RuntimeException e) {
                    this.g.a(e, "Error while calling the listener.", "log", defpackage.aljr.e);
                }
            }
        }
    }

    @Override // defpackage.alkw
    public final void b(defpackage.altk altkVar) {
        try {
            j$.util.Optional optional = this.d;
            defpackage.alju aljuVar = new defpackage.alju(altkVar, 2);
            if (true == optional.isPresent()) {
                ((defpackage.amgv) optional.get()).e((defpackage.altk) aljuVar.a);
            }
        } catch (java.lang.RuntimeException e) {
            this.g.a(e, "Error while calling the listener.", "logAiCoreMetadata", defpackage.aljr.e);
        }
    }

    @Override // defpackage.alkw
    public final void c(defpackage.aloa aloaVar) {
        try {
            j$.util.Optional optional = this.d;
            defpackage.alju aljuVar = new defpackage.alju(aloaVar, 3);
            if (true == optional.isPresent()) {
                ((defpackage.amgv) optional.get()).g((defpackage.aloa) aljuVar.a);
            }
        } catch (java.lang.RuntimeException e) {
            this.g.a(e, "Error while calling the listener.", "logModelConfig", defpackage.aljr.e);
        }
    }

    @Override // defpackage.alkw
    public final void d() {
        if (this.e.booleanValue()) {
            f();
        }
    }

    @Override // defpackage.alkw
    public final void e(defpackage.amgv amgvVar, java.lang.Boolean bool) {
        this.d = j$.util.Optional.of(amgvVar);
        this.e = bool;
        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/EventLogger", "init", 56, "EventLogger.java").y("EventLogger initialized with compression mode: %s", true != bool.booleanValue() ? "disabled" : "enabled");
    }

    public alkb(defpackage.aljy aljyVar) {
        this(aljyVar, new defpackage.amda(1));
    }
}
