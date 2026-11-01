package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adod {
    public final defpackage.ajcu a;
    public final j$.util.Optional b;
    public final java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final defpackage.adon f;
    public final boolean g;
    public final int h;
    public final int i;

    public adod(defpackage.ajcu ajcuVar, j$.util.Optional optional, java.lang.String str, int i, java.lang.String str2, defpackage.adon adonVar, boolean z, int i2) {
        this.a = ajcuVar;
        this.b = optional;
        this.i = 1;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = adonVar;
        this.g = z;
        this.h = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adod) {
            defpackage.adod adodVar = (defpackage.adod) obj;
            if (this.a.equals(adodVar.a) && this.b.equals(adodVar.b)) {
                int i = this.i;
                int i2 = adodVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.c.equals(adodVar.c) && this.d == adodVar.d && this.e.equals(adodVar.e) && this.f.equals(adodVar.f) && this.g == adodVar.g && this.h == adodVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        defpackage.anty.aJ(this.i);
        return (((((((((((((((iHashCode * 1000003) ^ 1) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.h;
    }

    public final java.lang.String toString() {
        int i = this.i;
        j$.util.Optional optional = this.b;
        return "CallAvatarGlobalSettings{scheduledExecutorService=" + java.lang.String.valueOf(this.a) + ", customTerseModel=" + java.lang.String.valueOf(optional) + ", speechRecognizerType=" + (i != 1 ? "null" : "TERSE") + ", superpackName=" + this.c + ", superpackVersion=" + this.d + ", modelConfigFileName=" + this.e + ", ttsConfig=" + java.lang.String.valueOf(this.f) + ", shouldRecordAudioData=" + this.g + ", shouldOverrideMuteQualcommCheck=false, requestedPlaybackProgressEventsRate=" + this.h + '}';
    }

    public adod() {
        throw null;
    }
}
