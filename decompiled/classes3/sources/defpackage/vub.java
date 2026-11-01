package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vub {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;
    public final int c;
    public final defpackage.vtz d;
    public final defpackage.vtz e;
    public final android.telecom.PhoneAccountHandle f;
    public final java.lang.String g;
    public final boolean h;

    public vub(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, defpackage.vtz vtzVar, defpackage.vtz vtzVar2, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = vtzVar;
        this.e = vtzVar2;
        this.f = phoneAccountHandle;
        this.g = str;
        this.h = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vub) {
            defpackage.vub vubVar = (defpackage.vub) obj;
            if (this.a.equals(vubVar.a) && this.b.equals(vubVar.b) && this.c == vubVar.c && this.d.equals(vubVar.d) && this.e.equals(vubVar.e) && this.f.equals(vubVar.f) && this.g.equals(vubVar.g) && this.h == vubVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.f;
        defpackage.vtz vtzVar = this.e;
        defpackage.vtz vtzVar2 = this.d;
        java.lang.CharSequence charSequence = this.b;
        return "VoicemailFullscreenPromoModel{title=" + java.lang.String.valueOf(this.a) + ", description=" + java.lang.String.valueOf(charSequence) + ", imageResourceId=" + this.c + ", primaryAction=" + java.lang.String.valueOf(vtzVar2) + ", secondaryAction=" + java.lang.String.valueOf(vtzVar) + ", phoneAccountHandle=" + java.lang.String.valueOf(phoneAccountHandle) + ", sourceType=" + this.g + ", isPinSet=" + this.h + '}';
    }

    public vub() {
        throw null;
    }
}
