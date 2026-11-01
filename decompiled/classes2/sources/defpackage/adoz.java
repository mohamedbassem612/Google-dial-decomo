package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adoz implements adpg {
    public final defpackage.kvt a;

    public adoz(defpackage.kvt kvtVar) {
        this.a = kvtVar;
    }

    public final void a(android.media.AudioFormat audioFormat) {
        lpb.a();
        java.lang.Object obj = this.a.a;
        defpackage.hze hzeVar = (defpackage.hze) obj;
        if (!hzeVar.f.compareAndSet(false, true)) {
            a.bI(defpackage.hze.a.d(), "activate called when already activated", "com/android/dialer/audio/impl/ExternalAudioSource", "activate", 'L', "ExternalAudioSource.java", zct.b);
            return;
        }
        hzeVar.e = j$.util.Optional.of(audioFormat);
        defpackage.hyy hyyVar = hzeVar.b;
        defpackage.hyy.a.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "externalSourceActivated", 82, "AudioSourceSelector.java").v("enter externalSourceActivated");
        try {
            hyyVar.c.eT(ahqx.h(new defpackage.gra(hyyVar, obj, 15, (byte[]) null))).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            if (e instanceof java.lang.InterruptedException) {
                java.lang.Thread.currentThread().interrupt();
            }
            if (hyyVar.d.a()) {
                mni.cx(new defpackage.fkh(e, 13, null));
            } else {
                a.bq(defpackage.hyy.a.c(), "failed stopping internal source", "com/android/dialer/audio/impl/AudioSourceSelector", "externalSourceActivated", 's', "AudioSourceSelector.java", e, zct.b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b(afpl afplVar, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            defpackage.kvt kvtVar = this.a;
            kvtVar.b.execute(new aawj(this, bArr2, 10));
        }
    }

    public final void c(afpl afplVar) {
        lpb.a();
        java.lang.Object obj = this.a.a;
        defpackage.hze hzeVar = (defpackage.hze) obj;
        if (!hzeVar.f.compareAndSet(true, false)) {
            a.bI(defpackage.hze.a.d(), "deactivate called when not activated", "com/android/dialer/audio/impl/ExternalAudioSource", "deactivate", 'V', "ExternalAudioSource.java", zct.b);
            return;
        }
        defpackage.hyy hyyVar = hzeVar.b;
        defpackage.hyy.a.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "externalSourceDeactivated", 131, "AudioSourceSelector.java").v("enter externalSourceDeactivated");
        agsm.i(89, ahrv.g(hyyVar.c.eT(ahqx.h(new defpackage.gra(hyyVar, obj, 14, (byte[]) null)))), "Failed to deactivate external audio source.", new java.lang.Object[0]);
        hzeVar.e = j$.util.Optional.empty();
    }
}
