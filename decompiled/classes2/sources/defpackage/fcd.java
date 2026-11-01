package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fcd {
    public static final aify a = aify.p(12);

    public static aify a(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.util.List listM$1 = mp$.ExternalSyntheticApiModelOutline0.m$1(audioDeviceInfo);
        java.util.TreeSet treeSet = new java.util.TreeSet(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparing(new defpackage.etw(4))));
        java.util.Iterator it = listM$1.iterator();
        while (it.hasNext()) {
            android.media.AudioProfile audioProfileM = mp$.ExternalSyntheticApiModelOutline0.m(it.next());
            if (mp$.ExternalSyntheticApiModelOutline0.m(audioProfileM) != 1 && eum.U(mp$.ExternalSyntheticApiModelOutline0.m$1(audioProfileM))) {
                for (int i : mp$.ExternalSyntheticApiModelOutline0.m(audioProfileM)) {
                    treeSet.add(java.lang.Integer.valueOf(i));
                }
            }
        }
        return aify.n(treeSet);
    }
}
