package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahho implements ahhq {
    public final aw a;
    public final defpackage.ahhr b;

    public ahho(aw awVar, defpackage.ahhr ahhrVar) {
        this.a = awVar;
        this.b = ahhrVar;
    }

    public final void a(ahhp ahhpVar) {
        aw awVar = this.a;
        az azVarG = awVar.G();
        ahvr.ci(azVarG);
        android.content.ComponentCallbacks2 componentCallbacks2 = ahhpVar.b;
        azVarG.registerComponentCallbacks(componentCallbacks2);
        java.util.Map map = this.b.a;
        java.util.Set set = (java.util.Set) map.get(azVarG);
        if (set != null) {
            set.add(ahhpVar);
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(ahhpVar);
            map.put(azVarG, hashSet);
        }
        awVar.P().c(new defpackage.ahhn(this, azVarG, ahhpVar, componentCallbacks2));
    }
}
