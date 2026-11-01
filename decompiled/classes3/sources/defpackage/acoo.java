package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acoo implements defpackage.acom {
    public final defpackage.aiep a = new defpackage.aiep(3);

    @Override // defpackage.acom
    public final ajcq a(apew apewVar) {
        defpackage.aiep aiepVar = this.a;
        synchronized (aiepVar) {
            aiepVar.add(apewVar);
        }
        return ajcm.a;
    }
}
