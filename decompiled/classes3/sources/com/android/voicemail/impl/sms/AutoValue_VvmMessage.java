package com.android.voicemail.impl.sms;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AutoValue_VvmMessage extends com.android.voicemail.impl.sms.VvmMessage {
    public final android.telecom.PhoneAccountHandle a;
    public final java.lang.String b;
    public final android.os.Bundle c;

    public AutoValue_VvmMessage(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, android.os.Bundle bundle) {
        this.a = phoneAccountHandle;
        this.b = str;
        this.c = bundle;
    }

    @Override // com.android.voicemail.impl.sms.VvmMessage
    public final android.os.Bundle a() {
        return this.c;
    }

    @Override // com.android.voicemail.impl.sms.VvmMessage
    public final android.telecom.PhoneAccountHandle b() {
        return this.a;
    }

    @Override // com.android.voicemail.impl.sms.VvmMessage
    public final java.lang.String c() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.android.voicemail.impl.sms.VvmMessage) {
            com.android.voicemail.impl.sms.VvmMessage vvmMessage = (com.android.voicemail.impl.sms.VvmMessage) obj;
            if (this.a.equals(vvmMessage.b()) && ((str = this.b) != null ? str.equals(vvmMessage.c()) : vvmMessage.c() == null)) {
                android.os.Bundle bundle = this.c;
                if (bundle == null) {
                    if (vvmMessage.a() == null) {
                        return true;
                    }
                } else if (bundle.equals(vvmMessage.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        android.os.Bundle bundle = this.c;
        return iHashCode2 ^ (bundle != null ? bundle.hashCode() : 0);
    }

    public final java.lang.String toString() {
        android.os.Bundle bundle = this.c;
        return "VvmMessage{phoneAccountHandle=" + this.a.toString() + ", prefix=" + this.b + ", fields=" + java.lang.String.valueOf(bundle) + '}';
    }
}
