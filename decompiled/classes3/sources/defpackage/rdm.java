package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdm implements ahth {
    public final defpackage.qur a;

    public rdm(defpackage.qur qurVar) {
        this.a = qurVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rdm) && this.a == ((defpackage.rdm) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VoiceScreenChipClickedEvent(chipKey=" + this.a + ')';
    }
}
