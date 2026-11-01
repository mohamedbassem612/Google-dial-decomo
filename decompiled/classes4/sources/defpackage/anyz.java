package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anyz extends defpackage.antw {
    final defpackage.anyy a;
    final anpv b;
    final /* synthetic */ anzg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anyz(anzg anzgVar, defpackage.anyy anyyVar, anpv anpvVar) {
        super((char[]) null);
        j$.util.Objects.requireNonNull(anzgVar);
        this.c = anzgVar;
        this.a = anyyVar;
        ahvr.cj(anpvVar, "resolver");
        this.b = anpvVar;
    }

    public final void g(anqw anqwVar) {
        java.util.logging.Logger logger = anzg.a;
        java.util.logging.Level level = java.util.logging.Level.WARNING;
        anzg anzgVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new java.lang.Object[]{anzgVar.h, anqwVar});
        anzd anzdVar = anzgVar.K;
        if (anzdVar.a.get() == anzg.f) {
            anzg anzgVar2 = anzdVar.c;
            anzdVar.c((annp) null);
        }
        if (anzgVar.V != 3) {
            anzgVar.I.b(3, "Failed to resolve name: {0}", new java.lang.Object[]{anqwVar});
            anzgVar.V = 3;
        }
        defpackage.anyy anyyVar = this.a;
        if (anyyVar == anzgVar.u) {
            anyyVar.a.b(anqwVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.antw
    public final anqw m(defpackage.anpt anptVar) {
        anzs anzsVar;
        java.lang.Object obj;
        anzg anzgVar = this.c;
        anrc anrcVar = anzgVar.n;
        anrcVar.c();
        if (anzgVar.s != this.b) {
            return anqw.b;
        }
        defpackage.anqy anqyVar = anptVar.a;
        if (!anqyVar.d()) {
            g(anqyVar.a());
            return anqyVar.a();
        }
        java.lang.Object objC = anqyVar.c();
        anmd anmdVar = anzgVar.I;
        defpackage.anlw anlwVar = anptVar.b;
        anmdVar.b(1, "Resolved address: {0}, config={1}", new java.lang.Object[]{objC, anlwVar});
        if (anzgVar.V != 2) {
            anmdVar.b(2, "Address resolved: {0}", new java.lang.Object[]{objC});
            anzgVar.V = 2;
        }
        anpr anprVar = anptVar.c;
        annp annpVar = (annp) anlwVar.a(annp.a);
        anzs anzsVar2 = (anprVar == null || (obj = anprVar.b) == null) ? null : (anzs) obj;
        anqw anqwVar = anprVar != null ? anprVar.a : null;
        if (anzgVar.O) {
            if (anzsVar2 != null) {
                if (annpVar != null) {
                    anzgVar.K.c(annpVar);
                    if (anzsVar2.a() != null) {
                        anmdVar.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    anzgVar.K.c(anzsVar2.a());
                }
            } else if (anqwVar == null) {
                anzd anzdVar = anzgVar.K;
                anzsVar2 = anzg.e;
                anzdVar.c((annp) null);
            } else {
                if (!anzgVar.N) {
                    anmdVar.a(2, "Fallback to error due to invalid first service config without default config");
                    anqw anqwVar2 = anprVar.a;
                    ahvr.bN(!anqwVar2.h(), "the error status must not be OK");
                    anrcVar.execute(new anxz(this, anqwVar2, 2));
                    return anqwVar2;
                }
                anzsVar2 = anzgVar.L;
            }
            if (!anzsVar2.equals(anzgVar.L)) {
                anmdVar.b(2, "Service config changed{0}", new java.lang.Object[]{anzsVar2 == anzg.e ? " to empty" : ""});
                anzgVar.L = anzsVar2;
                anzgVar.T.a = anzsVar2.a;
            }
            try {
                anzgVar.N = true;
            } catch (java.lang.RuntimeException e) {
                anns annsVar = this.c.h;
                anzg.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", "[" + java.lang.String.valueOf(annsVar) + "] Unexpected exception from parsing service config", (java.lang.Throwable) e);
            }
            anzsVar = anzsVar2;
        } else {
            if (anzsVar2 != null) {
                anmdVar.a(2, "Service config from name resolver discarded by channel settings");
            }
            anzsVar = anzg.e;
            if (annpVar != null) {
                anmdVar.a(2, "Config selector from name resolver discarded by channel settings");
            }
            anzgVar.K.c(anzsVar.a());
        }
        defpackage.anlw anlwVar2 = anptVar.b;
        defpackage.anyy anyyVar = this.a;
        if (anyyVar != this.c.u) {
            return anqw.b;
        }
        defpackage.antt anttVar = new defpackage.antt(anlwVar2);
        anlv anlvVar = annp.a;
        java.lang.Object obj2 = anttVar.a;
        if (obj2 == null) {
            ((java.util.IdentityHashMap) anttVar.b).remove(anlvVar);
        } else if (((defpackage.anlw) obj2).b.containsKey(anlvVar)) {
            anttVar.b(0).remove(anlvVar);
        }
        java.util.Map map = anzsVar.c;
        if (map != null) {
            anttVar.c(defpackage.anon.a, map);
            anttVar.a();
        }
        return anyyVar.a.a(new defpackage.anoj(anqyVar.c(), anttVar.a(), anzsVar.b));
    }
}
