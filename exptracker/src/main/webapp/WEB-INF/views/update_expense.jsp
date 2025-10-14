<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Update Expense</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h2 class="text-center mb-4">✏️ Update Expense</h2>

    <form action="/saveExpense" method="post">
        <input type="hidden" name="id" value="${expense.id}" />

        <div class="mb-3">
            <label for="title" class="form-label">Title</label>
            <input type="text" class="form-control" id="title" name="title" value="${expense.title}" required>
        </div>

        <div class="mb-3">
            <label for="amount" class="form-label">Amount (₹)</label>
            <input type="number" step="0.01" class="form-control" id="amount" name="amount" value="${expense.amount}" required>
        </div>

        <div class="mb-3">
            <label for="category" class="form-label">Category</label>
            <select class="form-select" id="category" name="category">
                <option value="Food" ${expense.category == 'Food' ? 'selected' : ''}>Food</option>
                <option value="Transport" ${expense.category == 'Transport' ? 'selected' : ''}>Transport</option>
                <option value="Utilities" ${expense.category == 'Utilities' ? 'selected' : ''}>Utilities</option>
                <option value="Entertainment" ${expense.category == 'Entertainment' ? 'selected' : ''}>Entertainment</option>
                <option value="Other" ${expense.category == 'Other' ? 'selected' : ''}>Other</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="expenseDate" class="form-label">Date</label>
            <input type="date" class="form-control" id="expenseDate" name="expenseDate" value="${expense.expenseDate}" required>
        </div>

        <div class="mb-3">
            <label for="notes" class="form-label">Notes</label>
            <textarea class="form-control" id="notes" name="notes" rows="3">${expense.notes}</textarea>
        </div>

        <button type="submit" class="btn btn-success">Update Expense</button>
        <a href="/" class="btn btn-secondary ms-2">Cancel</a>
    </form>
</div>
</body>
</html>
