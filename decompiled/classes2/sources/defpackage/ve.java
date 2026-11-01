package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ve {
    public java.lang.Object a;

    public ve(char[] cArr) {
        this.a = j$.util.Optional.empty();
    }

    public final void a(int i) {
        this.a = java.lang.Integer.valueOf(i | (-16777216));
    }

    public final defpackage.vk b() {
        return new defpackage.vk(this.a, (byte[]) null);
    }

    public final void c(int i, android.os.Bundle bundle, aw awVar) {
        if (((j$.util.Optional) this.a).isPresent()) {
            java.lang.Object obj = this.a;
            if (i != 1) {
                defpackage.lvn lvnVar = (defpackage.lvn) ((j$.util.Optional) obj).orElseThrow();
                bundle.getString("extra_call_id");
                lvnVar.a();
            } else {
                defpackage.lvn lvnVar2 = (defpackage.lvn) ((j$.util.Optional) obj).orElseThrow();
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) bundle.getParcelable("extra_selected_account_handle");
                boolean z = bundle.getBoolean("extra_set_default");
                bundle.getString("extra_call_id");
                j$.util.Optional.of(awVar);
                lvnVar2.b(phoneAccountHandle, z);
            }
        }
    }

    public final void d(defpackage.lvn lvnVar) {
        this.a = j$.util.Optional.of(lvnVar);
    }

    public ve() {
    }
}
