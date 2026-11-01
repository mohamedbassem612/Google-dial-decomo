package androidx.work;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class OverwritingInputMerger extends defpackage.grx {
    @Override // defpackage.grx
    public final defpackage.grp a(java.util.List list) {
        defpackage.ipc ipcVar = new defpackage.ipc((char[]) null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((defpackage.grp) it.next()).d());
        }
        ipcVar.s(linkedHashMap);
        return ipcVar.q();
    }
}
