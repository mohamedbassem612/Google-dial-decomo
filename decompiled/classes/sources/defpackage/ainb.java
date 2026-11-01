package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ainb extends defpackage.ainp {
    public ainb(java.lang.Class cls) {
        super("tags", cls, false, true);
    }

    @Override // defpackage.ainp
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, defpackage.aino ainoVar) {
        defpackage.aiqs aiqsVar = (defpackage.aiqs) obj;
        if (aiqsVar != null) {
            aiqo aiqoVar = new aiqo((defpackage.aiqp) aiqsVar.c.d);
            while (aiqoVar.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) aiqoVar.next();
                if (((java.util.Set) entry.getValue()).isEmpty()) {
                    ainoVar.a((java.lang.String) entry.getKey(), null);
                } else {
                    java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        ainoVar.a((java.lang.String) entry.getKey(), it.next());
                    }
                }
            }
        }
    }
}
