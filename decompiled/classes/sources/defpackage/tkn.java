package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tkn implements defpackage.keo {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public tkn(defpackage.kgl kglVar, int i) {
        this.$cid = i;
        if (kglVar == null) {
            defpackage.aooh.i("stirShakenStorage");
        }
        this.a = kglVar;
    }

    @Override // defpackage.keo
    public final java.lang.Object a(java.util.Collection collection, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.lang.Long(((kdy) it.next()).b));
            }
            java.lang.Object objE = ((defpackage.kgl) this.a).e(arrayList, aolnVar);
            return objE != defpackage.aolu.a ? defpackage.aojh.a : objE;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(j$.time.Instant.ofEpochMilli(((kdy) it2.next()).b));
        }
        defpackage.tts ttsVar = (defpackage.tts) this.a;
        java.lang.Object objAj = defpackage.aoov.aj(ttsVar.b, new tkz(linkedHashSet, ttsVar, (defpackage.aoln) null, 12), aolnVar);
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (objAj != aoluVar) {
            objAj = defpackage.aojh.a;
        }
        return objAj != aoluVar ? defpackage.aojh.a : objAj;
    }

    public tkn(defpackage.tts ttsVar, int i) {
        this.$cid = i;
        this.a = ttsVar;
    }
}
