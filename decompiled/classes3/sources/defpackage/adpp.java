package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpp implements defpackage.adph {
    private static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallUplinkAudioTrackFactory");
    private final defpackage.vqf b;

    public adpp(android.content.Context context) {
        defpackage.vqf vqfVar = new defpackage.vqf(context, (char[]) null);
        if (context.checkCallingOrSelfPermission("android.permission.MODIFY_PHONE_STATE") != 0) {
            throw new java.lang.SecurityException("android.permission.MODIFY_PHONE_STATE permission is missing");
        }
        this.b = vqfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    private static android.media.AudioTrack b(android.media.AudioFormat audioFormat, int i) throws adpd {
        try {
            android.media.AudioTrack.Builder audioFormat2 = new android.media.AudioTrack.Builder().setBufferSizeInBytes(i).setAudioFormat(audioFormat);
            a.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallUplinkAudioTrackFactory", "createAudioAttributesForUplinkPlayback", 121, "VoiceCallUplinkAudioTrackFactory.java").v("Creating playback attributes with VC usage");
            return audioFormat2.setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(2).build()).build();
        } catch (java.lang.UnsupportedOperationException e) {
            throw new adpd("Failed to create AudioTrack", e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    @Override // defpackage.adph
    public final defpackage.vqf a(android.media.AudioFormat audioFormat) throws adpd {
        java.lang.Object obj;
        android.media.AudioDeviceInfo[] devices = ((android.media.AudioManager) this.b.a).getDevices(2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
            arrayList.add(new defpackage.vqf(audioDeviceInfo));
        }
        aify aifyVarN = aify.n(arrayList);
        int size = aifyVarN.size();
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = ((defpackage.vqf) aifyVarN.get(i)).a;
            i++;
        } while (((android.media.AudioDeviceInfo) obj).getType() != 18);
        if (obj == null) {
            throw new adpd("Could not find telephony output device");
        }
        android.media.AudioTrack audioTrackB = b(audioFormat, afsq.U(audioFormat));
        if (audioTrackB.setPreferredDevice((android.media.AudioDeviceInfo) obj)) {
            return new defpackage.vqf(audioTrackB);
        }
        audioTrackB.release();
        throw new adpd("Failed to set telephony device as preferred device");
    }
}
