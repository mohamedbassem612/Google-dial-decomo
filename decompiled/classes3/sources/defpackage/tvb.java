package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tvb {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;

    public tvb(long j, java.lang.String str, java.lang.String str2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    static android.net.Uri b(android.content.pm.ShortcutInfo shortcutInfo) {
        long longExtra = hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfo).getLongExtra("contactId", -1L);
        if (longExtra != -1) {
            return android.provider.ContactsContract.Contacts.getLookupUri(longExtra, hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfo));
        }
        throw new java.lang.IllegalStateException("No contact ID found for a pure phone number shortcut");
    }

    static defpackage.tva c() {
        defpackage.tva tvaVar = new defpackage.tva();
        tvaVar.e(-1);
        return tvaVar;
    }

    public final android.net.Uri a() {
        return android.provider.ContactsContract.Contacts.getLookupUri(this.a, this.b);
    }

    final boolean d(android.content.pm.ShortcutInfo shortcutInfo) {
        int i = this.d;
        if (i != -1 && hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfo) != i) {
            return true;
        }
        java.lang.String string = hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfo).toString();
        java.lang.String str = this.c;
        return (string.equals(str) && hq$.ExternalSyntheticApiModelOutline1.m$1(shortcutInfo).toString().equals(str)) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tvb) {
            defpackage.tvb tvbVar = (defpackage.tvb) obj;
            if (this.a == tvbVar.a && this.b.equals(tvbVar.b) && this.c.equals(tvbVar.c) && this.d == tvbVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final java.lang.String toString() {
        return "DialerShortcut{contactId=" + this.a + ", lookupKey=" + this.b + ", displayName=" + this.c + ", rank=" + this.d + '}';
    }

    public tvb() {
        throw null;
    }
}
