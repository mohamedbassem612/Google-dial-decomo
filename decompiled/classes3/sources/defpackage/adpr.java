package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpr implements defpackage.adpf {
    public final java.util.List a = new java.util.ArrayList();
    public defpackage.adpg b;
    private final j$.util.Optional c;
    private final defpackage.vqf d;
    private final defpackage.vqf e;

    public adpr(defpackage.vqf vqfVar, defpackage.vqf vqfVar2, j$.util.Optional optional) {
        this.e = vqfVar2;
        this.d = vqfVar;
        this.c = optional;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    @Override // defpackage.adpf
    public final defpackage.afpl a(android.media.AudioFormat audioFormat) throws adpd {
        java.lang.Object objB = defpackage.adpa.b(defpackage.adpa.a("android.media.audiopolicy.AudioPolicy"), "createAudioRecordSink", new java.lang.Class[]{defpackage.adpa.a("android.media.audiopolicy.AudioMix")}, android.media.AudioRecord.class, this.d.a, this.e.a);
        if (objB == null) {
            throw new adpd("createAudioRecordSink returned null");
        }
        android.media.AudioRecord audioRecord = (android.media.AudioRecord) objB;
        if (audioRecord.getState() != 1) {
            throw new adpd("Failed to create AudioRecord, current state: " + audioRecord.getState());
        }
        aihb aihbVar = new aihb();
        defpackage.adpg adpgVar = this.b;
        if (adpgVar != null) {
            aihbVar.i(adpgVar);
        }
        j$.util.Optional optional = this.c;
        defpackage.xch xchVar = new defpackage.xch(aihbVar, 19);
        if (true == optional.isPresent()) {
            ((aihb) xchVar.a).i(new adoz((kvt) optional.get()));
        }
        defpackage.afpl afplVar = new defpackage.afpl(audioRecord, (java.util.Set) aihbVar.h());
        this.a.add(afplVar);
        return afplVar;
    }
}
