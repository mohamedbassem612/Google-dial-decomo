package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibc implements ajcb {
    public final java.util.Set a = new java.util.HashSet();

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.ibd.a.c(), "cannot set current call audio", "com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl$CallAudioFutureCallbacks", "onFailure", (char) 235, "CallAudioManagerImpl.java", th, zct.b);
    }

    public final void b(java.lang.Object obj) {
        aimz aimzVar = defpackage.ibd.a;
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl$CallAudioFutureCallbacks", "onSuccess", 225, "CallAudioManagerImpl.java");
        java.util.Set set = this.a;
        aimwVarL.w("invoking %d callAudioChangeListeners", set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.lop lopVar = (defpackage.lop) it.next();
            j$.util.Optional optional = (j$.util.Optional) ((defpackage.ibd) lopVar.b).i.get();
            if (optional.isPresent()) {
                aimzVar.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl$CallAudioChangeListener", "onCurrentAudioChanged", 249, "CallAudioManagerImpl.java").v("Active call audio available.");
                ((dsd) lopVar.a).b(j$.util.Optional.of((defpackage.iax) optional.orElseThrow()));
            } else {
                a.bI(aimzVar.d(), "No active call audio available.", "com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl$CallAudioChangeListener", "onCurrentAudioChanged", (char) 252, "CallAudioManagerImpl.java", zct.b);
                ((dsd) lopVar.a).d(new java.lang.RuntimeException("Could not acquire CallAudio"));
            }
            it.remove();
        }
    }
}
