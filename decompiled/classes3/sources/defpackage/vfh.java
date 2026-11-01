package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vfh {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/sync/VvmStateSync");

    public static defpackage.vfg a(java.util.List list, java.util.List list2) {
        aihd aihdVar = (aihd) j$.util.Collection.-EL.stream(list).map(new defpackage.var(6)).collect(aido.b);
        if (aihdVar.size() < list.size()) {
            a.bI(a.d(), "There are duplicated local voicemails", "com/android/dialer/voicemail/service/impl/sync/VvmStateSync", "diffLocalAndServerState", '\"', "VvmStateSync.java", zct.b);
        }
        java.util.Map map = (java.util.Map) j$.util.Collection.-EL.stream(list2).collect(j$.util.stream.Collectors.toMap(new defpackage.var(8), j$.util.function.Function.-CC.identity(), new vfd(0), new defpackage.rqc(11)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.vdg vdgVar = (defpackage.vdg) it.next();
            java.lang.String str = vdgVar.c;
            if (map.containsKey(str)) {
                arrayList.add(new defpackage.vff(vdgVar, (defpackage.vfe) map.get(str)));
            }
        }
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new defpackage.ree(map, 13)).filter(new defpackage.sqj(14));
        j$.util.stream.Collector collector = aido.a;
        aify aifyVar = (aify) streamFilter.collect(collector);
        aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(list2).filter(new defpackage.ree(aihdVar, 12)).collect(collector);
        aify aifyVar3 = (aify) j$.util.Collection.-EL.stream(arrayList).filter(new defpackage.sqj(15)).filter(new defpackage.sqj(16)).map(new defpackage.var(7)).collect(collector);
        aify aifyVar4 = (aify) j$.util.Collection.-EL.stream(arrayList).filter(new defpackage.sqj(17)).filter(new defpackage.sqj(18)).collect(collector);
        aify aifyVar5 = (aify) j$.util.Collection.-EL.stream(arrayList).filter(new defpackage.sqj(19)).filter(new defpackage.sqj(20)).collect(collector);
        aify aifyVar6 = (aify) j$.util.Collection.-EL.stream(arrayList).filter(new vgb(1)).collect(collector);
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null localVoicemailsToDelete");
        }
        if (aifyVar2 == null) {
            throw new java.lang.NullPointerException("Null serverVoicemailsToDownload");
        }
        if (aifyVar3 == null) {
            throw new java.lang.NullPointerException("Null localVoicemailsToMarkAsRead");
        }
        if (aifyVar4 == null) {
            throw new java.lang.NullPointerException("Null serverVoicemailsToMarkAsRead");
        }
        if (aifyVar5 == null) {
            throw new java.lang.NullPointerException("Null voicemailsToArchive");
        }
        if (aifyVar6 != null) {
            return new defpackage.vfg(aifyVar, aifyVar2, aifyVar3, aifyVar4, aifyVar5, aifyVar6);
        }
        throw new java.lang.NullPointerException("Null voicemailsToDelete");
    }
}
