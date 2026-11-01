package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxu implements defpackage.ajcb {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.agxx b;
    final /* synthetic */ defpackage.ahyn c;
    final /* synthetic */ defpackage.aogc d;

    public agxu(defpackage.aogc aogcVar, java.lang.Object obj, defpackage.agxx agxxVar, defpackage.ahyn ahynVar) {
        this.a = obj;
        this.b = agxxVar;
        this.c = ahynVar;
        j$.util.Objects.requireNonNull(aogcVar);
        this.d = aogcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ajcb
    public final void b(java.lang.Object obj) {
        defpackage.aikk aikkVar;
        java.lang.Object obj2 = this.a;
        if (obj2 == null) {
            throw new java.lang.NullPointerException("Cannot notify change for a null key");
        }
        defpackage.aogc aogcVar = this.d;
        synchronized (aogcVar.c) {
            defpackage.aigv aigvVar = new defpackage.aigv(4);
            if (obj2 instanceof defpackage.agxt) {
                defpackage.aigy aigyVar = (defpackage.aigy) aogcVar.b.get(obj2);
                if (aigyVar != null) {
                    aigvVar.b(aigyVar);
                }
            } else if (obj2 instanceof defpackage.agxk) {
                defpackage.ailj it = ((defpackage.agxk) obj2).a().iterator();
                while (it.hasNext()) {
                    defpackage.aigy aigyVar2 = (defpackage.aigy) aogcVar.b.get(it.next());
                    if (aigyVar2 != null) {
                        aigvVar.b(aigyVar2);
                    }
                }
            } else {
                defpackage.aigy aigyVar3 = (defpackage.aigy) aogcVar.b.get(obj2);
                if (aigyVar3 != null) {
                    aigvVar.b(aigyVar3);
                }
            }
            aikkVar = new defpackage.aikk((defpackage.aikm) aigvVar.g());
        }
        defpackage.ailj it2 = aikkVar.iterator();
        while (it2.hasNext()) {
            defpackage.ahyn ahynVar = this.c;
            defpackage.agxy agxyVar = (defpackage.agxy) it2.next();
            if (ahynVar.e() != agxyVar) {
                agxyVar.a(this.b);
            }
        }
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
    }
}
