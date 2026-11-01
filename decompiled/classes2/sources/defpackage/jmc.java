package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jmc {
    public static final aimz a = aimz.i("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier");

    public static void a(android.content.Context context, defpackage.jjx jjxVar) {
        a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToBlockNumberAndOptionallyReportSpam", 40, "ShowBlockReportSpamDialogNotifier.java").v("enter");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("show_dialog_to_block_number_and_optionally_report_spam");
        sns.u(intent, "dialog_info", jjxVar);
        epq.a(context).d(intent);
    }

    public static void b(android.content.Context context, defpackage.jjx jjxVar) {
        a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToBlockOptionallyReport", 139, "ShowBlockReportSpamDialogNotifier.java").v("enter");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("show_dialog_to_block_optionally_report");
        sns.u(intent, "dialog_info", jjxVar);
        epq.a(context).d(intent);
    }

    public static void c(android.content.Context context, defpackage.jjx jjxVar) {
        a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToReportNotScam", 99, "ShowBlockReportSpamDialogNotifier.java").v("enter");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("show_dialog_to_report_not_scam");
        sns.u(intent, "dialog_info", jjxVar);
        epq.a(context).d(intent);
    }

    public static void d(android.content.Context context, defpackage.jjx jjxVar) {
        a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToReportNotSpam", 86, "ShowBlockReportSpamDialogNotifier.java").v("enter");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("show_dialog_to_report_not_spam");
        sns.u(intent, "dialog_info", jjxVar);
        epq.a(context).d(intent);
    }

    public static void e(android.content.Context context, defpackage.jjx jjxVar) {
        a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToUnblockNumber", 125, "ShowBlockReportSpamDialogNotifier.java").v("enter");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("show_dialog_to_unblock_number");
        sns.u(intent, "dialog_info", jjxVar);
        epq.a(context).d(intent);
    }
}
